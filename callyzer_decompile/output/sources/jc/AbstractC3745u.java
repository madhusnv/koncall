package jc;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.u */
/* loaded from: classes.dex */
public abstract class AbstractC3745u {
    public static final C3742r Companion = new C3742r();
    private final Long contentLength;
    private final boolean isDuplex;
    private final boolean isOneShot = true;

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC3745u)) {
            return false;
        }
        AbstractC3745u abstractC3745u = (AbstractC3745u) obj;
        return AbstractC4154l.m8918a(abstractC3745u.getContentLength(), getContentLength()) && abstractC3745u.isOneShot() == isOneShot() && abstractC3745u.isDuplex() == isDuplex();
    }

    public abstract Long getContentLength();

    public boolean isDuplex() {
        return this.isDuplex;
    }

    public boolean isOneShot() {
        return this.isOneShot;
    }
}
