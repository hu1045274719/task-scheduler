package com.bigblue.scheduler.service;

import com.bigblue.scheduler.domain.TaskResult;

/**
 * @Author: TheBigBlue
 * @Description: 各个组件需实现该接口，重写处理逻辑
 * @Date: 2020/6/12
 */
public interface INodeTask {

    /**
     * @Author: TheBigBlue 
     * @Description: 执行自定义的Task逻辑，当有异常后抛出
     * @Date: 2020/6/12
     * @Return: T
     **/
    TaskResult doTask() throws Exception;
}
