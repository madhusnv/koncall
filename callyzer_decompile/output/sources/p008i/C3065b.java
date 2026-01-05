package p008i;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import c6.AbstractC0880j;
import d6.AbstractC1614d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import p007h.C2760l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i.b */
/* loaded from: classes.dex */
public final class C3065b extends AbstractC3064a {

    /* renamed from: a */
    public final int f16417a;

    public C3065b() {
        int iM5265a = AbstractC1614d.m5265a();
        this.f16417a = iM5265a;
        if (iM5265a <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // p008i.AbstractC3064a
    /* renamed from: a */
    public final Intent mo1125a(Context context, Object obj) {
        C2760l input = (C2760l) obj;
        AbstractC4154l.m8923f(input, "input");
        boolean zM2423g = AbstractC0880j.m2423g();
        int i10 = this.f16417a;
        if (zM2423g) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(AbstractC0880j.m2421e(input.f15319a));
            int iMin = Math.min(i10, input.f15320b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(AbstractC0880j.m2421e(input.f15319a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveInfoResolveActivity == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(AbstractC0880j.m2421e(input.f15319a));
        int iMin2 = Math.min(i10, input.f15320b);
        if (iMin2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }

    @Override // p008i.AbstractC3064a
    /* renamed from: b */
    public final C5047i mo1126b(Context context, Object obj) {
        C2760l input = (C2760l) obj;
        AbstractC4154l.m8923f(input, "input");
        return null;
    }

    @Override // p008i.AbstractC3064a
    /* renamed from: c */
    public final Object mo1127c(Intent intent, int i10) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        Uri uri = clipData.getItemAt(i11).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return C6668r.f31943a;
    }
}
