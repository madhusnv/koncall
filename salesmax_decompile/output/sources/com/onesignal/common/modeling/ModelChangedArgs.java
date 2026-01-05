package com.onesignal.common.modeling;

import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class ModelChangedArgs {
    private final Model model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public ModelChangedArgs(Model model, String str, String str2, Object obj, Object obj2) {
        sq8.m48649h(model, "model");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "property");
        this.model = model;
        this.path = str;
        this.property = str2;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    public final Model getModel() {
        return this.model;
    }

    public final Object getNewValue() {
        return this.newValue;
    }

    public final Object getOldValue() {
        return this.oldValue;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProperty() {
        return this.property;
    }
}
