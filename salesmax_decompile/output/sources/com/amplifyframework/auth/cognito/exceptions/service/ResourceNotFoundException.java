package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class ResourceNotFoundException extends ServiceException {
    public ResourceNotFoundException(Throwable th) {
        super("Could not find the requested online resource.", "Retry with exponential back-off or check your config file to be sure the endpoint is valid.", th);
    }
}
