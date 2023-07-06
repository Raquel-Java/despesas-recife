package expense.recife.dao;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean
	DataSource getDataSource() {
		return DataSourceBuilder.create()
				.driverClassName("org.postgresql.Driver")
				.url("jdbc:postgresql://lallah.db.elephantsql.com:5432/vcultaeo")
				.username("vcultaeo")
				.password("nRZF78QtyqKriU8Wn_EbEKk6iEoWADbs").build();
	}

}
