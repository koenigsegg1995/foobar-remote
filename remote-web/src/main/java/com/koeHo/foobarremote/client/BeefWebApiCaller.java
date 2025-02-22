package com.koeHo.foobarremote.client;

import com.koeHo.foobarremote.model.dto.response.PlayerStateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

/**
 * 呼叫 BeefWebApi
 */
@Component
public class BeefWebApiCaller {

    @Autowired
    private WebClient webClient;

    /**
     * 取得播放器當前狀態
     *
     * @return PlayerStateResponse
     */
    public PlayerStateResponse getPlayerState(){
        return webClient
                .get()                                  // GET 請求
                .uri("/player/state")               // API
                .retrieve()                             // 取回
                .bodyToMono(PlayerStateResponse.class)  // 轉換 PlayerStateResponse
                .block(Duration.ofSeconds(5));          // 等待響應最多 5 秒
    }

}
