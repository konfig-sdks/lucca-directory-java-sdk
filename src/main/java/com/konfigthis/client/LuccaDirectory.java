package com.konfigthis.client;

import com.konfigthis.client.api.UsersApi;

public class LuccaDirectory {
    private ApiClient apiClient;
    public final UsersApi users;

    public LuccaDirectory() {
        this(null);
    }

    public LuccaDirectory(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.users = new UsersApi(this.apiClient);
    }

}
