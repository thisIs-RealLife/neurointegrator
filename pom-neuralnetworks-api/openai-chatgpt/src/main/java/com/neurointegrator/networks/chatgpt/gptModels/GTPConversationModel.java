package com.neurointegrator.networks.chatgpt.gptModels;

/**
 * Модели для поддержания "Завершений" (диалога)
 */
public enum  GTPConversationModel {
    DAVINCI("text-davinci-003"),
    CURIE("text-curie-001"),
    BABBAGE("text-babbage-001"),
    ADA("text-ada-001");

    private final String modelId;

    GTPConversationModel(String modelId) {
        this.modelId = modelId;
    }

    public String getModelId() {
        return modelId;
    }
}
