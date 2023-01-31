package com.neurointegrator.networks.chatgpt.gptModels;

public enum GPTEditModel {
    DAVINCI("text-davinci-edit-001");

    private final String modelId;

    GPTEditModel(String modelId) {
        this.modelId = modelId;
    }

    public String getModelId() {
        return modelId;
    }
}
