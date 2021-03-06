package com.github.brunodles.slackupload

import org.gradle.api.Plugin
import org.gradle.api.Project

class SlackUpload implements Plugin<Project> {

    public static final String SLACK_UPLOAD_EXTENSION = "slackUpload"

    @Override
    void apply(Project project) {
        project.extensions.create(SLACK_UPLOAD_EXTENSION, SlackUploadPluginExtension)
        project.task("createTokenFile", type: CreateTokenFileTask)
        project.task("uploadTask", type: UploadTask)
    }
}

class SlackUploadPluginExtension {
    String token
    String tokenFile
}