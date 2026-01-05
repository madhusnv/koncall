package bx;

import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bx.e */
/* loaded from: classes3.dex */
public final class C0795e extends AbstractC0792b {

    /* renamed from: b */
    public boolean f5012b;

    /* renamed from: c */
    public File[] f5013c;

    /* renamed from: d */
    public int f5014d;

    @Override // bx.AbstractC0798h
    /* renamed from: a */
    public final File mo2123a() {
        boolean z6 = this.f5012b;
        File file = this.f5021a;
        if (!z6) {
            this.f5012b = true;
            return file;
        }
        File[] fileArr = this.f5013c;
        if (fileArr != null && this.f5014d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f5013c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f5013c;
        AbstractC4154l.m8920c(fileArr2);
        int i10 = this.f5014d;
        this.f5014d = i10 + 1;
        return fileArr2[i10];
    }
}
