import net.tanesha.recaptcha.ReCaptchaFactory

class RecaptchaService {
			recap = ReCaptchaFactory.newReCaptcha(config.recaptcha.publicKey, config.recaptcha.privateKey, config.recaptcha.includeNoScript)
	}
}