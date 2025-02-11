package com.koeHo.foobarremote.model.dto.response;

import lombok.Data;

import java.util.List;

/**
 * 接收 GET /api/player/state Res資料
 */
@Data
public class PlayerStateResponse {

    // 播放器狀態資訊
    private Player player;

    /**
     * 播放器狀態資訊
     */
    @Data
    public static class Player{
        private Info info;
        private ActiveItem activeItem;
        private String playbackState; // 播放狀態
        private Volume volume;

        /**
         * 播放器基本資訊
         */
        @Data
        public static class Info{
            private String name;            // 播放器名稱
            private String title;           // 播放器標題
            private String version;         // foobar2000 版本
            private String pluginVersion;   // beefweb 插件版本
        }

        /**
         * 當前播放項目資訊
         */
        @Data
        public static class ActiveItem{
            private String playlistId;      // 播放清單 ID
            private Integer playlistIndex;  // 在播放清單中的索引位置
            private Integer index;          // 歌曲索引
            private Integer position;       // 當前播放位置（毫秒）
            private Integer duration;       // 歌曲總長度（毫秒）
            private List<String> columns;   // 顯示的欄位資訊
        }

        /**
         * 音量控制資訊
         */
        @Data
        public static class Volume{
            private String type;            // 音量類型
            private Integer min;            // 最小音量值
            private Integer max;            // 最大音量值
            private Integer value;          // 當前音量值
            private Boolean isMuted;        // 是否靜音
        }
    }

}