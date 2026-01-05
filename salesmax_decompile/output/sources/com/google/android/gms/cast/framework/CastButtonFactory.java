package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.media.C2318f;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzln;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.c7b;
import p001o.xab;

/* loaded from: classes5.dex */
public final class CastButtonFactory {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("CastButtonFactory");
    private static final List zzc = new ArrayList();
    private static final List zzd = new ArrayList();
    private static zza zze = null;

    private CastButtonFactory() {
    }

    public static MenuItem setUpMediaRouteButton(Context context, Menu menu, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(menu);
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i)));
        }
        boolean zZzh = zzh(context);
        try {
            MediaRouteActionProvider mediaRouteActionProviderZzc = zzc(menuItemFindItem);
            if (mediaRouteActionProviderZzc != null && zzi(context, null)) {
                mediaRouteActionProviderZzc.m7879p(true);
            }
            zzf(context, menuItemFindItem, zzd(null, zZzh));
            zzc.add(new WeakReference(menuItemFindItem));
            zze(null, zZzh);
            return menuItemFindItem;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i)), e);
        }
    }

    public static void zza(Context context) {
        Iterator it = zzc.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) ((WeakReference) it.next()).get();
            if (menuItem != null) {
                try {
                    zzf(context, menuItem, null);
                } catch (IllegalArgumentException e) {
                    zzb.m13802w("Unexpected exception when refreshing MediaRouteSelectors for Cast buttons", e);
                }
            }
        }
        Iterator it2 = zzd.iterator();
        while (it2.hasNext()) {
            MediaRouteButton mediaRouteButton = (MediaRouteButton) ((WeakReference) it2.next()).get();
            if (mediaRouteButton != null) {
                zzg(context, mediaRouteButton, null);
            }
        }
    }

    public static void zzb(zza zzaVar) {
        zze = zzaVar;
        try {
            ((zze) zzaVar).zza.zzf.zzj(false);
        } catch (RemoteException e) {
            CastContext.zzb.m13796d(e, "Unable to call %s on %s.", "setCustomMediaRouteDialogFactorySetUp", zzz.class.getSimpleName());
        }
    }

    private static MediaRouteActionProvider zzc(MenuItem menuItem) {
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) xab.m55895a(menuItem);
        if (mediaRouteActionProvider == null) {
            return null;
        }
        return mediaRouteActionProvider;
    }

    private static c7b zzd(c7b c7bVar, boolean z) {
        if (z) {
            return com.google.android.gms.internal.cast.zzaa.zza();
        }
        return null;
    }

    private static void zze(c7b c7bVar, boolean z) {
        com.google.android.gms.internal.cast.zzr.zzd(z ? zzln.CAST_SDK_DEFAULT_DEVICE_DIALOG : zzln.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    private static void zzf(Context context, MenuItem menuItem, c7b c7bVar) {
        C2318f mergedSelector;
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaRouteActionProvider mediaRouteActionProviderZzc = zzc(menuItem);
        if (mediaRouteActionProviderZzc == null) {
            throw new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider");
        }
        CastContext castContextZza = CastContext.zza(context);
        if (castContextZza != null && (mergedSelector = castContextZza.getMergedSelector()) != null) {
            mediaRouteActionProviderZzc.m7881r(mergedSelector);
        }
        if (c7bVar != null) {
            mediaRouteActionProviderZzc.m7880q(c7bVar);
        }
    }

    private static void zzg(Context context, MediaRouteButton mediaRouteButton, c7b c7bVar) {
        C2318f mergedSelector;
        Preconditions.checkMainThread("Must be called from the main thread.");
        CastContext castContextZza = CastContext.zza(context);
        if (castContextZza != null && (mergedSelector = castContextZza.getMergedSelector()) != null) {
            mediaRouteButton.setRouteSelector(mergedSelector);
        }
        if (c7bVar != null) {
            mediaRouteButton.setDialogFactory(c7bVar);
        }
    }

    private static boolean zzh(Context context) {
        CastContext castContextZza = CastContext.zza(context);
        return castContextZza != null && castContextZza.getCastOptions().zze();
    }

    private static boolean zzi(Context context, c7b c7bVar) {
        return zzh(context);
    }

    public static void setUpMediaRouteButton(Context context, MediaRouteButton mediaRouteButton) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        boolean zZzh = zzh(context);
        if (mediaRouteButton != null) {
            if (zzi(context, null)) {
                mediaRouteButton.setAlwaysVisible(true);
            }
            zzg(context, mediaRouteButton, zzd(null, zZzh));
            zzd.add(new WeakReference(mediaRouteButton));
        }
        zze(null, zZzh);
    }
}
