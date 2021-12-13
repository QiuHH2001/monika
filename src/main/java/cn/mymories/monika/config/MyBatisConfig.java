package cn.mymories.monika.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/*
 * @author MintureYe
 * @project monika
 * @date 2021/11/23 23:21
 */


@Configuration
@MapperScan("cn.mymories.monika.mbg.mapper")
public class MyBatisConfig {
}
