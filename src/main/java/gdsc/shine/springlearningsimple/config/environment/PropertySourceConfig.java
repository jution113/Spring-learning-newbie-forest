package gdsc.shine.springlearningsimple.config.environment;

import org.springframework.core.env.Environment;

// TODO: Java-based Configuration을 하기 위한 클래스로 지정하기
// TODO: application.properties 파일을 활용하기 위한 설정 추가하기
public class PropertySourceConfig {

    private final Environment env;

    public PropertySourceConfig(Environment env) {
        this.env = env;
    }

    // TODO: application.properties의 security.jwt.token.secret-key 값을 활용하여 JwtTokenKeyProvider를 빈으로 등록하기
    public JwtTokenKeyProvider jwtTokenKeyProvider() {
        return new JwtTokenKeyProvider("");
    }
}