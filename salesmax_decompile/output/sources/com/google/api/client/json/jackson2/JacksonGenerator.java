package com.google.api.client.json.jackson2;

import com.google.api.client.json.JsonGenerator;
import java.math.BigDecimal;
import java.math.BigInteger;
import p001o.b99;

/* loaded from: classes3.dex */
final class JacksonGenerator extends JsonGenerator {
    private final JacksonFactory factory;
    private final b99 generator;

    public JacksonGenerator(JacksonFactory jacksonFactory, b99 b99Var) {
        this.factory = jacksonFactory;
        this.generator = b99Var;
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.generator.close();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void enablePrettyPrint() {
        this.generator.mo17557g();
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Flushable
    public void flush() {
        this.generator.flush();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeBoolean(boolean z) {
        this.generator.mo18452h(z);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndArray() {
        this.generator.mo18453k();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndObject() {
        this.generator.mo18454o();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeFieldName(String str) {
        this.generator.mo18455r(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNull() {
        this.generator.mo18456s();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(int i) {
        this.generator.mo18437C(i);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartArray() {
        this.generator.mo18446X();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartObject() {
        this.generator.mo18447Y();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeString(String str) {
        this.generator.d0(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public JacksonFactory getFactory() {
        return this.factory;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(long j) {
        this.generator.mo18438D(j);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        this.generator.mo18441K(bigInteger);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(double d) {
        this.generator.mo18457t(d);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(float f) {
        this.generator.mo18458u(f);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        this.generator.mo18440J(bigDecimal);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(String str) {
        this.generator.mo18439H(str);
    }
}
