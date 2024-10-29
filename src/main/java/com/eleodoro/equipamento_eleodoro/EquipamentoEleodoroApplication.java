package com.eleodoro.equipamento_eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class EquipamentoEleodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipamentoEleodoroApplication.class, args);
	}

}
