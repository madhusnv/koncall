package bx;

import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bx.c */
/* loaded from: classes3.dex */
public final class C0793c extends AbstractC0792b {

    /* renamed from: b */
    public boolean f5007b;

    /* renamed from: c */
    public File[] f5008c;

    /* renamed from: d */
    public int f5009d;

    /* renamed from: e */
    public boolean f5010e;

    @Override // bx.AbstractC0798h
    /* renamed from: a */
    public final File mo2123a() {
        boolean z6 = this.f5010e;
        File file = this.f5021a;
        if (!z6 && this.f5008c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f5008c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f5010e = true;
            }
        }
        File[] fileArr = this.f5008c;
        if (fileArr == null || this.f5009d >= fileArr.length) {
            if (this.f5007b) {
                return null;
            }
            this.f5007b = true;
            return file;
        }
        AbstractC4154l.m8920c(fileArr);
        int i10 = this.f5009d;
        this.f5009d = i10 + 1;
        return fileArr[i10];
    }
}
