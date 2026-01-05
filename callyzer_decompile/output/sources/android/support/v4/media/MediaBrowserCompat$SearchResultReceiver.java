package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0222a;
import java.util.ArrayList;
import p003d.C1543d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C1543d {
    @Override // p003d.C1543d
    /* renamed from: a */
    public final void mo547a(int i10, Bundle bundle) {
        Parcelable[] parcelableArray;
        if (bundle != null) {
            bundle.setClassLoader(AbstractC0222a.class.getClassLoader());
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("search_results") || (parcelableArray = bundle.getParcelableArray("search_results")) == null) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
