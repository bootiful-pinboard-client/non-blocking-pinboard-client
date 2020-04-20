package pinboard

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import reactor.core.publisher.Flux

@Configuration
@EnableConfigurationProperties(PinboardProperties::class)
class PinboardClientAutoConfiguration(private val properties: PinboardProperties) {

	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnClass(value = [Flux::class])
	fun pinboardClient()  = PinboardClient(properties.token)
}