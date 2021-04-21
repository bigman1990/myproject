package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.*;

/**
 * @author 41127
 * 线程池配置
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
    /**
     * 核心线程数量，会一直存在，除非allowCoreThreadTimeOut设置为true
     */
    private static final int CORE_POOL_SIZE = 5;
    /**
     * 线程池允许的最大线程池数量
     */
    private static final int MAXIMUM_POOL_SIZE = 10;
    /**
     * 线程数量超过corePoolSize，空闲线程的最大超时时间
     */
    private static final long KEEP_ALIVE_TIME = 60L;
    /**
     * 工作队列，保存未执行的Runnable 任务
     */
    private static final int WORK_QUEUE = 100;

    @Bean(name="threadPoolExecutor")
    public ExecutorService getThreadPoolExecutor(){
        //创建线程池对象
        return new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME,
                TimeUnit.SECONDS, new ArrayBlockingQueue(WORK_QUEUE), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    }
}
