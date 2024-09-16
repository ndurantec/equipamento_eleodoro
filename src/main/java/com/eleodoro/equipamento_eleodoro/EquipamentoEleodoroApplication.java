package com.eleodoro.equipamento_eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EquipamentoEleodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipamentoEleodoroApplication.class, args);
	}

}
