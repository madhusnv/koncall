package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class km0 extends ntf {
    /* renamed from: c */
    public static Metadata m35892c(ywc ywcVar) {
        ywcVar.m58454r(12);
        int iM58440d = (ywcVar.m58440d() + ywcVar.m58444h(12)) - 4;
        ywcVar.m58454r(44);
        ywcVar.m58455s(ywcVar.m58444h(12));
        ywcVar.m58454r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM58448l = null;
            if (ywcVar.m58440d() >= iM58440d) {
                break;
            }
            ywcVar.m58454r(48);
            int iM58444h = ywcVar.m58444h(8);
            ywcVar.m58454r(4);
            int iM58440d2 = ywcVar.m58440d() + ywcVar.m58444h(12);
            String strM58448l2 = null;
            while (ywcVar.m58440d() < iM58440d2) {
                int iM58444h2 = ywcVar.m58444h(8);
                int iM58444h3 = ywcVar.m58444h(8);
                int iM58440d3 = ywcVar.m58440d() + iM58444h3;
                if (iM58444h2 == 2) {
                    int iM58444h4 = ywcVar.m58444h(16);
                    ywcVar.m58454r(8);
                    if (iM58444h4 == 3) {
                        while (ywcVar.m58440d() < iM58440d3) {
                            strM58448l = ywcVar.m58448l(ywcVar.m58444h(8), uh2.f48929a);
                            int iM58444h5 = ywcVar.m58444h(8);
                            for (int i = 0; i < iM58444h5; i++) {
                                ywcVar.m58455s(ywcVar.m58444h(8));
                            }
                        }
                    }
                } else if (iM58444h2 == 21) {
                    strM58448l2 = ywcVar.m58448l(iM58444h3, uh2.f48929a);
                }
                ywcVar.m58452p(iM58440d3 * 8);
            }
            ywcVar.m58452p(iM58440d2 * 8);
            if (strM58448l != null && strM58448l2 != null) {
                arrayList.add(new AppInfoTable(iM58444h, strM58448l + strM58448l2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // p001o.ntf
    /* renamed from: b */
    public Metadata mo33901b(mdb mdbVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m35892c(new ywc(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
