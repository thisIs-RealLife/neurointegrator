package com.neurointegrator.networks.chatgpt.gptModels;

/**
 * Модели для модерации текста
 *
 * По умолчанию используется text-moderation-latestкоторый будет автоматически обновляться с течением времени.
 * Это гарантирует, что вы всегда используете нашу самую точную модель.
 * Если вы используетеtext-moderation-stable, мы предоставим предварительное уведомление перед обновлением модели.
 * Точность text-moderation-stableможет быть немного ниже, чем для text-moderation-latest.
 */
public enum GPTModerationModel {
    STABLE("text-moderation-stable"),
    LATEST("text-moderation-latest");

    private final String modelId;

    GPTModerationModel(String modelId) {
        this.modelId = modelId;
    }

    public String getModelId() {
        return modelId;
    }
}
