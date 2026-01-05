package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

/* loaded from: classes3.dex */
public class TextureStyle extends StampStyle {

    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
            throw null;
        }

        public /* synthetic */ Builder(zzaf zzafVar) {
        }

        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public final /* bridge */ /* synthetic */ StampStyle.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public Builder self() {
            return this;
        }
    }

    public /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzag zzagVar) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
