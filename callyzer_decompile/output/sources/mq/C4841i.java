package mq;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.i */
/* loaded from: classes3.dex */
public final class C4841i extends AbstractC4854v {

    /* renamed from: a */
    public final int f24286a;

    /* renamed from: b */
    public final Uri f24287b;

    public C4841i(int i10, Uri fileUri) {
        AbstractC4154l.m8923f(fileUri, "fileUri");
        this.f24286a = i10;
        this.f24287b = fileUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4841i)) {
            return false;
        }
        C4841i c4841i = (C4841i) obj;
        return this.f24286a == c4841i.f24286a && AbstractC4154l.m8918a(this.f24287b, c4841i.f24287b);
    }

    public final int hashCode() {
        return this.f24287b.hashCode() + (Integer.hashCode(this.f24286a) * 31);
    }

    public final String toString() {
        return "OnAttachAudioFileToCallRecording(callLogId=" + this.f24286a + ", fileUri=" + this.f24287b + ")";
    }
}
