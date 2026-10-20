package api.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

@Configuration
public class RateLimiterConfig {

	@Bean
	public KeyResolver ipKeyResolver() {
		return exchange -> {
			var remoteAddress = exchange.getRequest().getRemoteAddress();

			if (remoteAddress != null && remoteAddress.getAddress() != null) {
				return Mono.just(remoteAddress.getAddress().getHostAddress());
			}

			return Mono.just("unknown");
		};
	}
}