package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzdy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public class MediaQueue {
    long zza;
    LruCache zzd;
    private final RemoteMediaClient zzh;
    private PendingResult zzl;
    private PendingResult zzm;
    private final Set zzn = Collections.synchronizedSet(new HashSet());
    private final Logger zzg = new Logger("MediaQueue");
    private final int zzi = Math.max(20, 1);
    List zzb = new ArrayList();
    final SparseIntArray zzc = new SparseIntArray();
    final List zze = new ArrayList();
    final Deque zzf = new ArrayDeque(20);
    private final Handler zzj = new zzdy(Looper.getMainLooper());
    private final TimerTask zzk = new zzq(this);

    public static abstract class Callback {
        public void itemsInsertedInRange(int i, int i2) {
        }

        public void itemsReloaded() {
        }

        public void itemsRemovedAtIndexes(int[] iArr) {
        }

        public void itemsReorderedAtIndexes(List<Integer> list, int i) {
        }

        public void itemsUpdatedAtIndexes(int[] iArr) {
        }

        public void mediaQueueChanged() {
        }

        public void mediaQueueWillChange() {
        }
    }

    public MediaQueue(RemoteMediaClient remoteMediaClient, int i, int i2) {
        this.zzh = remoteMediaClient;
        remoteMediaClient.registerCallback(new zzs(this));
        zzt(20);
        this.zza = zzp();
        zzo();
    }

    public static /* bridge */ /* synthetic */ void zze(MediaQueue mediaQueue, int i, int i2) {
        synchronized (mediaQueue.zzn) {
            Iterator it = mediaQueue.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).itemsInsertedInRange(i, i2);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzf(MediaQueue mediaQueue, int[] iArr) {
        synchronized (mediaQueue.zzn) {
            Iterator it = mediaQueue.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).itemsRemovedAtIndexes(iArr);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(MediaQueue mediaQueue, List list, int i) {
        synchronized (mediaQueue.zzn) {
            Iterator it = mediaQueue.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).itemsReorderedAtIndexes(list, i);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(final MediaQueue mediaQueue) {
        if (mediaQueue.zzf.isEmpty() || mediaQueue.zzl != null || mediaQueue.zza == 0) {
            return;
        }
        PendingResult pendingResultZzj = mediaQueue.zzh.zzj(CastUtils.zzf(mediaQueue.zzf));
        mediaQueue.zzl = pendingResultZzj;
        pendingResultZzj.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzp
            @Override // com.google.android.gms.common.api.ResultCallback
            public final void onResult(Result result) {
                this.zza.zzn((RemoteMediaClient.MediaChannelResult) result);
            }
        });
        mediaQueue.zzf.clear();
    }

    public static /* bridge */ /* synthetic */ void zzk(MediaQueue mediaQueue) {
        mediaQueue.zzc.clear();
        for (int i = 0; i < mediaQueue.zzb.size(); i++) {
            mediaQueue.zzc.put(((Integer) mediaQueue.zzb.get(i)).intValue(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzp() {
        MediaStatus mediaStatus = this.zzh.getMediaStatus();
        if (mediaStatus == null || mediaStatus.zzd()) {
            return 0L;
        }
        return mediaStatus.zzb();
    }

    private final void zzq() {
        this.zzj.removeCallbacks(this.zzk);
    }

    private final void zzr() {
        PendingResult pendingResult = this.zzm;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzm = null;
        }
    }

    private final void zzs() {
        PendingResult pendingResult = this.zzl;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzl = null;
        }
    }

    private final void zzt(int i) {
        this.zzd = new zzr(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        synchronized (this.zzn) {
            Iterator it = this.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).mediaQueueChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        synchronized (this.zzn) {
            Iterator it = this.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).itemsReloaded();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(int[] iArr) {
        synchronized (this.zzn) {
            Iterator it = this.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).itemsUpdatedAtIndexes(iArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzx() {
        synchronized (this.zzn) {
            Iterator it = this.zzn.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).mediaQueueWillChange();
            }
        }
    }

    private final void zzy() {
        zzq();
        this.zzj.postDelayed(this.zzk, 500L);
    }

    public PendingResult<RemoteMediaClient.MediaChannelResult> fetchMoreItemsRelativeToIndex(int i, int i2, int i3) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza == 0) {
            return RemoteMediaClient.zzf(2100, "No active media session");
        }
        int iItemIdAtIndex = itemIdAtIndex(i);
        return iItemIdAtIndex == 0 ? RemoteMediaClient.zzf(CastStatusCodes.INVALID_REQUEST, "index out of bound") : this.zzh.zzh(iItemIdAtIndex, i2, i3);
    }

    public MediaQueueItem getItemAtIndex(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return getItemAtIndex(i, true);
    }

    public int getItemCount() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzb.size();
    }

    public int[] getItemIds() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return CastUtils.zzf(this.zzb);
    }

    public int indexOfItemWithId(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzc.get(i, -1);
    }

    public int itemIdAtIndex(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (i < 0 || i >= this.zzb.size()) {
            return 0;
        }
        return ((Integer) this.zzb.get(i)).intValue();
    }

    public void registerCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzn.add(callback);
    }

    public void setCacheCapacity(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        LruCache lruCache = this.zzd;
        ArrayList arrayList = new ArrayList();
        zzt(i);
        int size = lruCache.size();
        for (Map.Entry entry : lruCache.snapshot().entrySet()) {
            if (size > i) {
                int i2 = this.zzc.get(((Integer) entry.getKey()).intValue(), -1);
                if (i2 != -1) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } else {
                this.zzd.put((Integer) entry.getKey(), (MediaQueueItem) entry.getValue());
            }
            size--;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        zzx();
        zzw(CastUtils.zzf(arrayList));
        zzu();
    }

    public void unregisterCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzn.remove(callback);
    }

    public final void zzl() {
        zzx();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.evictAll();
        this.zze.clear();
        zzq();
        this.zzf.clear();
        zzr();
        zzs();
        zzv();
        zzu();
    }

    public final void zzm(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.m13802w(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzm = null;
        if (this.zzf.isEmpty()) {
            return;
        }
        zzy();
    }

    public final void zzn(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.m13802w(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzl = null;
        if (this.zzf.isEmpty()) {
            return;
        }
        zzy();
    }

    public final void zzo() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza != 0 && this.zzm == null) {
            zzr();
            zzs();
            PendingResult pendingResultZzi = this.zzh.zzi();
            this.zzm = pendingResultZzi;
            pendingResultZzi.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzo
                @Override // com.google.android.gms.common.api.ResultCallback
                public final void onResult(Result result) {
                    this.zza.zzm((RemoteMediaClient.MediaChannelResult) result);
                }
            });
        }
    }

    public MediaQueueItem getItemAtIndex(int i, boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (i < 0 || i >= this.zzb.size()) {
            return null;
        }
        int iIntValue = ((Integer) this.zzb.get(i)).intValue();
        LruCache lruCache = this.zzd;
        Integer numValueOf = Integer.valueOf(iIntValue);
        MediaQueueItem mediaQueueItem = (MediaQueueItem) lruCache.get(numValueOf);
        if (mediaQueueItem == null && z && !this.zzf.contains(numValueOf)) {
            while (this.zzf.size() >= this.zzi) {
                this.zzf.removeFirst();
            }
            this.zzf.add(Integer.valueOf(iIntValue));
            zzy();
        }
        return mediaQueueItem;
    }
}
