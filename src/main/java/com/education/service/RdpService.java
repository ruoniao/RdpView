package com.education.service;

import com.education.bean.RdpBean;
import org.springframework.stereotype.Service;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/16 22:05
 * Explain:
 */
@Service
public interface RdpService {
    RdpBean connect();
}
