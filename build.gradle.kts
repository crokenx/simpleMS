plugins {
	java
	id("org.springframework.boot") version "3.3.3"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.orders.crx"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Required for webflux
	implementation("org.springframework.boot:spring-boot-starter-webflux")

	// Spring Data REST (optional if you need REST repositories)
	implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")

	// R2DBC MySQL driver
	implementation("dev.miku:r2dbc-mysql:0.8.2.RELEASE")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	// Flyway to manage database creation
	implementation("org.flywaydb:flyway-core:9.16.0")
	implementation("org.flywaydb:flyway-mysql:8.4.4")

	// JDBC MySQL Driver
	runtimeOnly("mysql:mysql-connector-java:8.0.29")

	// H2 Database for testing
	/*implementation("io.r2dbc:r2dbc-h2")
	runtimeOnly("com.h2database:h2")*/
}

tasks.withType<Test> {
	useJUnitPlatform()
}
