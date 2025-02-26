package com.koeHo.foobarremote.player.controller;

import com.koeHo.foobarremote.client.BeefWebApiCaller;
import com.koeHo.foobarremote.model.dto.response.PlayerStateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 播放器控制
 */
@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private BeefWebApiCaller apiCaller;

    /**
     * 取得播放器當前狀態
     *
     * @return PlayerStateResponse
     *             播放狀態、音量等資訊
     */
    @GetMapping("/state")
    public PlayerStateResponse getPlayerState(){
        return apiCaller.getPlayerState();
    }

    /**
     * 播放
     */
    @PostMapping("/play")
    public void play(){
        apiCaller.play();
    }

}
