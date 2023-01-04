package com.eslammongy.asteroidradar.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/eslammongy/asteroidradar/domain/Asteroid;", "Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$AsteroidViewHolder;", "onClickListener", "Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$OnClickListener;", "(Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$OnClickListener;)V", "getOnClickListener", "()Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$OnClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AsteroidViewHolder", "DiffCallback", "OnClickListener", "app_debug"})
public final class AsteroidAdapter extends androidx.recyclerview.widget.ListAdapter<com.eslammongy.asteroidradar.domain.Asteroid, com.eslammongy.asteroidradar.adapter.AsteroidAdapter.AsteroidViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.eslammongy.asteroidradar.adapter.AsteroidAdapter.OnClickListener onClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.eslammongy.asteroidradar.adapter.AsteroidAdapter.DiffCallback DiffCallback = null;
    
    public AsteroidAdapter(@org.jetbrains.annotations.NotNull()
    com.eslammongy.asteroidradar.adapter.AsteroidAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eslammongy.asteroidradar.adapter.AsteroidAdapter.OnClickListener getOnClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eslammongy.asteroidradar.adapter.AsteroidAdapter.AsteroidViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.eslammongy.asteroidradar.adapter.AsteroidAdapter.AsteroidViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$AsteroidViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eslammongy/asteroidradar/databinding/AsteroidsListItemBinding;", "(Lcom/eslammongy/asteroidradar/databinding/AsteroidsListItemBinding;)V", "bind", "", "asteroid", "Lcom/eslammongy/asteroidradar/domain/Asteroid;", "app_debug"})
    public static final class AsteroidViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.eslammongy.asteroidradar.databinding.AsteroidsListItemBinding binding = null;
        
        public AsteroidViewHolder(@org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.databinding.AsteroidsListItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.domain.Asteroid asteroid) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/eslammongy/asteroidradar/domain/Asteroid;", "Lkotlin/ParameterName;", "name", "asteroid", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.eslammongy.asteroidradar.domain.Asteroid, kotlin.Unit> clickListener = null;
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.eslammongy.asteroidradar.domain.Asteroid, kotlin.Unit> clickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.eslammongy.asteroidradar.domain.Asteroid, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.domain.Asteroid asteroid) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/eslammongy/asteroidradar/adapter/AsteroidAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/eslammongy/asteroidradar/domain/Asteroid;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.eslammongy.asteroidradar.domain.Asteroid> {
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.domain.Asteroid oldItem, @org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.domain.Asteroid newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.domain.Asteroid oldItem, @org.jetbrains.annotations.NotNull()
        com.eslammongy.asteroidradar.domain.Asteroid newItem) {
            return false;
        }
    }
}