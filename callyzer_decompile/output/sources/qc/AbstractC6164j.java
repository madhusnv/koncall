package qc;

import a2.AbstractC0030c;
import aws.smithy.kotlin.runtime.http.interceptors.ChecksumMismatchException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.j */
/* loaded from: classes.dex */
public abstract class AbstractC6164j {

    /* renamed from: a */
    public static final List f30038a = pe.m10834i("x-amz-checksum-crc32c", "x-amz-checksum-crc32", "x-amz-checksum-sha1", "x-amz-checksum-sha256");

    /* renamed from: a */
    public static final void m12200a(String str, String str2) {
        if (!AbstractC4154l.m8918a(str, str2)) {
            throw new ChecksumMismatchException(AbstractC0030c.m121l("Checksum mismatch. Expected ", str, " but was ", str2));
        }
    }
}
