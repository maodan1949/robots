package com.sirius.robots.comm.config;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.sirius.robots.comm.util.LogUtil;

/**
 * Created by Administrator on 2018/10/29 0029.
 */
public class UuidConvert extends ClassicConverter {

    public UuidConvert() {
    }
    @Override
    public String convert(ILoggingEvent event) {
        return LogUtil.getLogId();
    }
}
