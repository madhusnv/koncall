package p001o;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ps extends os {

    /* renamed from: a */
    public static final C16170a f40465a = new C16170a(null);

    /* renamed from: o.ps$a */
    public static final class C16170a {
        public C16170a() {
        }

        public /* synthetic */ C16170a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m44101a(Intent intent) {
            sq8.m48649h(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return ch3.m21246k();
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    Uri uri = clipData.getItemAt(i).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }
    }
}
