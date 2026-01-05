package com.google.android.gms.cast.framework.media;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.MediaQueue;

/* loaded from: classes5.dex */
public abstract class MediaQueueRecyclerViewAdapter<VH extends RecyclerView.d0> extends RecyclerView.AbstractC2371h {
    private final MediaQueue zza;
    private final MediaQueue.Callback zzb;

    public MediaQueueRecyclerViewAdapter(MediaQueue mediaQueue) {
        this.zza = mediaQueue;
        zzw zzwVar = new zzw(this, null);
        this.zzb = zzwVar;
        mediaQueue.registerCallback(zzwVar);
    }

    public void dispose() {
        this.zza.unregisterCallback(this.zzb);
    }

    public MediaQueueItem getItem(int i) {
        return this.zza.getItemAtIndex(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.zza.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public long getItemId(int i) {
        return this.zza.itemIdAtIndex(i);
    }

    public MediaQueue getMediaQueue() {
        return this.zza;
    }
}
