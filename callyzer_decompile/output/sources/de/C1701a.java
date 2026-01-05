package de;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import ge.C2580l;
import iz.C3391x;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: de.a */
/* loaded from: classes.dex */
public final class C1701a {

    /* renamed from: a */
    public final /* synthetic */ int f8307a;

    public /* synthetic */ C1701a(int i10) {
        this.f8307a = i10;
    }

    /* renamed from: a */
    public final Object m5395a(Object obj, C2580l c2580l) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.f8307a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!AbstractC4066g.m8842c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals(TransferTable.COLUMN_FILE))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (AbstractC5178p.m10113X(path, '/') && ((String) AbstractC6663m.m12743G(uri.getPathSegments())) != null) {
                        if (!AbstractC4154l.m8918a(uri.getScheme(), TransferTable.COLUMN_FILE)) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((C3391x) obj).f17999i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = c2580l.f14045a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC4154l.m8918a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC5178p.m10101L(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = c2580l.f14045a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
