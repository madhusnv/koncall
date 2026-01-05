package kn;

import android.net.Uri;
import com.sun.mail.util.AbstractC1452a;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.a */
/* loaded from: classes3.dex */
public final class C4121a {

    /* renamed from: a */
    public C4791b f21054a;

    /* renamed from: b */
    public final Uri f21055b;

    /* renamed from: c */
    public final File f21056c;

    /* renamed from: d */
    public File f21057d;

    /* renamed from: e */
    public final String f21058e;

    /* renamed from: f */
    public String f21059f;

    /* renamed from: g */
    public String f21060g;

    /* renamed from: h */
    public long f21061h;

    /* renamed from: i */
    public String f21062i;

    public /* synthetic */ C4121a(C4791b c4791b, Uri uri, File file, File file2, String str, String str2, long j6, int i10) {
        this(c4791b, uri, (i10 & 4) != 0 ? null : file, (i10 & 8) != 0 ? null : file2, str, (i10 & 32) != 0 ? null : str2, null, (i10 & 128) != 0 ? 0L : j6, null);
    }

    /* renamed from: a */
    public static C4121a m8892a(C4121a c4121a, Uri uri) {
        C4791b callLog = c4121a.f21054a;
        File file = c4121a.f21056c;
        File file2 = c4121a.f21057d;
        String str = c4121a.f21058e;
        String str2 = c4121a.f21059f;
        String str3 = c4121a.f21060g;
        long j6 = c4121a.f21061h;
        c4121a.getClass();
        String str4 = c4121a.f21062i;
        c4121a.getClass();
        c4121a.getClass();
        c4121a.getClass();
        AbstractC4154l.m8923f(callLog, "callLog");
        return new C4121a(callLog, uri, file, file2, str, str2, str3, j6, str4);
    }

    /* renamed from: b */
    public final C4791b m8893b() {
        return this.f21054a;
    }

    /* renamed from: c */
    public final void m8894c(File file) {
        this.f21057d = file;
    }

    /* renamed from: d */
    public final void m8895d(long j6) {
        this.f21061h = j6;
    }

    /* renamed from: e */
    public final void m8896e(String str) {
        this.f21059f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4121a)) {
            return false;
        }
        C4121a c4121a = (C4121a) obj;
        return AbstractC4154l.m8918a(this.f21054a, c4121a.f21054a) && AbstractC4154l.m8918a(this.f21055b, c4121a.f21055b) && AbstractC4154l.m8918a(this.f21056c, c4121a.f21056c) && AbstractC4154l.m8918a(this.f21057d, c4121a.f21057d) && AbstractC4154l.m8918a(this.f21058e, c4121a.f21058e) && AbstractC4154l.m8918a(this.f21059f, c4121a.f21059f) && AbstractC4154l.m8918a(this.f21060g, c4121a.f21060g) && this.f21061h == c4121a.f21061h && AbstractC4154l.m8918a(this.f21062i, c4121a.f21062i);
    }

    public final int hashCode() {
        int iHashCode = this.f21054a.hashCode() * 31;
        Uri uri = this.f21055b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        File file = this.f21056c;
        int iHashCode3 = (iHashCode2 + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.f21057d;
        int iHashCode4 = (iHashCode3 + (file2 == null ? 0 : file2.hashCode())) * 31;
        String str = this.f21058e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21059f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21060g;
        int iM4556c = AbstractC1452a.m4556c(0, AbstractC1452a.m4557d((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f21061h), 31);
        String str4 = this.f21062i;
        return (iM4556c + (str4 != null ? str4.hashCode() : 0)) * 961;
    }

    public final String toString() {
        C4791b c4791b = this.f21054a;
        File file = this.f21057d;
        String str = this.f21059f;
        String str2 = this.f21060g;
        long j6 = this.f21061h;
        String str3 = this.f21062i;
        StringBuilder sb2 = new StringBuilder("CallRecordModel(callLog=");
        sb2.append(c4791b);
        sb2.append(", audioFileUri=");
        sb2.append(this.f21055b);
        sb2.append(", sourceAudioFile=");
        sb2.append(this.f21056c);
        sb2.append(", compressAudioFile=");
        sb2.append(file);
        sb2.append(", localSourcePath=");
        a1.m14319B(sb2, this.f21058e, ", localCompressedPath=", str, ", downloadUrl=");
        sb2.append(str2);
        sb2.append(", compressedSize=");
        sb2.append(j6);
        return a1.m14335o(sb2, ", duration=0, bucketFileId=", str3, ", uploadUrl=null, uploadAuthToken=null)");
    }

    public C4121a(C4791b callLog, Uri uri, File file, File file2, String str, String str2, String str3, long j6, String str4) {
        AbstractC4154l.m8923f(callLog, "callLog");
        this.f21054a = callLog;
        this.f21055b = uri;
        this.f21056c = file;
        this.f21057d = file2;
        this.f21058e = str;
        this.f21059f = str2;
        this.f21060g = str3;
        this.f21061h = j6;
        this.f21062i = str4;
    }
}
