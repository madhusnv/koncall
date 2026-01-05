package com.amplifyframework.rx;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.geo.GeoCategoryBehavior;
import com.amplifyframework.geo.GeoException;
import com.amplifyframework.geo.models.Coordinates;
import com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions;
import com.amplifyframework.geo.options.GeoSearchByTextOptions;
import com.amplifyframework.geo.options.GetMapStyleDescriptorOptions;
import com.amplifyframework.rx.RxAdapters;
import java.util.Objects;
import p001o.wtf;

/* loaded from: classes5.dex */
final class RxGeoBinding implements RxGeoCategoryBehavior {
    private final GeoCategoryBehavior delegate;

    public RxGeoBinding() {
        this.delegate = Amplify.Geo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMapStyleDescriptor$0(GetMapStyleDescriptorOptions getMapStyleDescriptorOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.getMapStyleDescriptor(getMapStyleDescriptorOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchByCoordinates$3(Coordinates coordinates, Consumer consumer, Consumer consumer2) {
        this.delegate.searchByCoordinates(coordinates, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchByCoordinates$4(Coordinates coordinates, GeoSearchByCoordinatesOptions geoSearchByCoordinatesOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.searchByCoordinates(coordinates, geoSearchByCoordinatesOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchByText$1(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.searchByText(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchByText$2(String str, GeoSearchByTextOptions geoSearchByTextOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.searchByText(str, geoSearchByTextOptions, consumer, consumer2);
    }

    private static <T> wtf toSingle(RxAdapters.VoidBehaviors.ResultEmitter<T, GeoException> resultEmitter) {
        return RxAdapters.VoidBehaviors.toSingle(resultEmitter);
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf getAvailableMaps() {
        final GeoCategoryBehavior geoCategoryBehavior = this.delegate;
        Objects.requireNonNull(geoCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.u2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                geoCategoryBehavior.getAvailableMaps(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf getDefaultMap() {
        final GeoCategoryBehavior geoCategoryBehavior = this.delegate;
        Objects.requireNonNull(geoCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.r2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                geoCategoryBehavior.getDefaultMap(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf getMapStyleDescriptor() {
        final GeoCategoryBehavior geoCategoryBehavior = this.delegate;
        Objects.requireNonNull(geoCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.q2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                geoCategoryBehavior.getMapStyleDescriptor(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf searchByCoordinates(final Coordinates coordinates) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.t2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11053a.lambda$searchByCoordinates$3(coordinates, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf searchByText(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.v2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11074a.lambda$searchByText$1(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf getMapStyleDescriptor(final GetMapStyleDescriptorOptions getMapStyleDescriptorOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.w2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11088a.lambda$getMapStyleDescriptor$0(getMapStyleDescriptorOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf searchByCoordinates(final Coordinates coordinates, final GeoSearchByCoordinatesOptions geoSearchByCoordinatesOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.p2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11013a.lambda$searchByCoordinates$4(coordinates, geoSearchByCoordinatesOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGeoCategoryBehavior
    public wtf searchByText(final String str, final GeoSearchByTextOptions geoSearchByTextOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.s2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11044a.lambda$searchByText$2(str, geoSearchByTextOptions, consumer, consumer2);
            }
        });
    }

    public RxGeoBinding(GeoCategoryBehavior geoCategoryBehavior) {
        Objects.requireNonNull(geoCategoryBehavior);
        this.delegate = geoCategoryBehavior;
    }
}
