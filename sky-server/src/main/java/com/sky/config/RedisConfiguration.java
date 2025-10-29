package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
/**
 * Redis配置类，用于自定义RedisTemplate的配置。
 * 该类的作用是创建并配置一个RedisTemplate实例，用于与Redis进行数据交互。
 */
@Configuration  // 表示这是一个Spring配置类，Spring会在启动时加载该类中的配置
@Slf4j          // Lombok注解，用于启用日志功能，可以通过log变量输出日志信息
public class RedisConfiguration {

    /**
     * 创建并配置一个RedisTemplate实例。
     * RedisTemplate是Spring Data Redis提供的用于操作Redis的模板类。
     *
     * @param redisConnectionFactory Redis连接工厂，用于创建与Redis的连接
     * @return 配置好的RedisTemplate实例
     */
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        // 创建一个新的RedisTemplate实例
        RedisTemplate redisTemplate = new RedisTemplate();

        // 设置Redis连接工厂，用于建立与Redis的连接
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        // 为RedisTemplate设置键序列化器为StringRedisSerializer，确保Redis中的键以字符串形式存储和读取
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        // 返回配置好的RedisTemplate实例
        return redisTemplate;
    }
}
