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
     *             播放狀態、音量等資訊
     */
    public PlayerStateResponse getPlayerState(){
        return webClient
                .get()                                  // GET 請求
                .uri("/player/state")               // API uri
                .retrieve()                             // 回應處理方式
                .bodyToMono(PlayerStateResponse.class)  // 轉換 PlayerStateResponse
                .block(Duration.ofSeconds(5));          // 等待響應最多 5 秒
    }

    /**
     * 播放
     */
    public void play(){
        webClient
                .post()
                .uri("/player/play")
                .retrieve()
                .bodyToMono(Void.class)
                .block(Duration.ofSeconds(5));
    }

}
