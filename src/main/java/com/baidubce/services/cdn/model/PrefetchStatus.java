/*
 * Copyright 2016 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.baidubce.services.cdn.model;

import java.util.Date;

public class PrefetchStatus extends JsonObject {
    private String status;
    private PrefetchTask task;
    
    private Date createdAt;
    private Date finishedAt;
    private int progress;
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setTask(PrefetchTask task) {
        this.task = task;
    }
    
    public PrefetchTask getTask() {
        return task;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }
    
    public Date getFinishedAt() {
        return finishedAt;
    }
    
    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    public int getProgress() {
        return progress;
    }
}
