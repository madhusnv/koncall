package com.onesignal.notifications;

import p001o.id5;

/* loaded from: classes6.dex */
public final class BackgroundImageLayout {
    private final String bodyTextColor;
    private final String image;
    private final String titleTextColor;

    public BackgroundImageLayout() {
        this(null, null, null, 7, null);
    }

    public final String getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    public BackgroundImageLayout(String str, String str2, String str3) {
        this.image = str;
        this.titleTextColor = str2;
        this.bodyTextColor = str3;
    }

    public /* synthetic */ BackgroundImageLayout(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
