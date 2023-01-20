package com.assessment.reward.Reward.exception;

import com.assessment.reward.Reward.controller.RewardsController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RewardSystemException extends Exception {

    Logger log = LoggerFactory.getLogger(RewardsController.class);

    private static final long serialVersionUID = 1877777777L;

    public RewardSystemException(String message, Throwable cause) {
        super(message, cause);
        log.error("Reward Point System Exception: " + message);
    }


    public RewardSystemException(String message) {
        super(message);
        log.error("Reward Point System Exception: " + message);
    }

    public RewardSystemException(Throwable cause) {
        super(cause);
        if (cause != null) {
            log.error("Reward Point System Exception: " + cause.getMessage());
        }
    }


    public RewardSystemException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        log.error("Reward Point System Exception: " + message);
    }

}
