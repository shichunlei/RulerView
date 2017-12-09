# RulerView

## 运行截图

<img src="/image/rulerview.png" style="width: 30%;">



## 用法

1、xml

    <com.chingtech.rulerview.library.RulerView
        android:id="@+id/ruler"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        app:rv_alphaEnable="true"
        app:rv_indcatorColor="#414"
        app:rv_indcatorType="triangle"
        app:rv_indcatorWidth="5dp"
        app:rv_itemSpacing="8dp"
        app:rv_maxLineColor="@color/colorPrimary"
        app:rv_maxLineHeight="30dp"
        app:rv_maxLineWidth="3dp"
        app:rv_middleLineColor="#ee2"
        app:rv_middleLineHeight="20dp"
        app:rv_middleLineWidth="2dp"
        app:rv_minLineColor="#e6f"
        app:rv_minLineHeight="10dp"
        app:rv_minLineWidth="1dp"
        app:rv_resultTextColor="#444"
        app:rv_resultTextSize="20sp"
        app:rv_scaleTextColor="#e42"
        app:rv_scaleTextSize="15sp"
        app:rv_unit="CM"
        app:rv_unitTextColor="#666"
        app:rv_unitTextSize="15sp" />

2、java

    RulerView rulerview = findViewById(R.id.ruler);
    
    rulerview.initViewParam(78, 20, 180f, 1f);
    rulerview.setChooseValueChangeListener(new RulerView.OnChooseResulterListener() {
        @Override
        public void onChooseValueChange(float value) {
            // TODO do some work
        }
    });

## 自定义属性

    <declare-styleable name="RulerView">
        <attr format="float|reference" name="rv_defaultValue" />              <!-- 默认值 -->
        <attr format="float|reference" name="rv_minValue" />                  <!-- 最小值 -->
        <attr format="float|reference" name="rv_maxValue" />                  <!-- 最大值 -->
        <attr format="float|reference" name="rv_spanValue" />                 <!-- 精度，最小支持 0.1 -->
        <attr format="dimension|reference" name="rv_itemSpacing" />           <!-- 每个刻度间的宽度 -->
        <attr format="dimension|reference" name="rv_minLineHeight" />         <!-- 最短刻度线长度 -->
        <attr format="dimension|reference" name="rv_maxLineHeight" />         <!-- 最长刻度线长度 -->
        <attr format="dimension|reference" name="rv_middleLineHeight" />      <!-- 中间刻度线长度 -->
        <attr format="dimension|reference" name="rv_minLineWidth" />          <!-- 最短刻度线宽度 -->
        <attr format="dimension|reference" name="rv_maxLineWidth" />          <!-- 最长刻度线宽度 -->
        <attr format="dimension|reference" name="rv_middleLineWidth" />       <!-- 中间刻度线宽度 -->
        <attr format="color|reference" name="rv_scaleTextColor" />            <!-- 刻度盘文字颜色 -->
        <attr format="color|reference" name="rv_minLineColor" />              <!-- 最短刻度线颜色 -->
        <attr format="color|reference" name="rv_maxLineColor" />              <!-- 最大刻度线颜色 -->
        <attr format="color|reference" name="rv_middleLineColor" />           <!-- 中间刻度线颜色 -->
        <attr format="dimension|reference" name="rv_scaleTextSize" />         <!-- 刻度盘文字大小 -->
        <attr format="dimension|reference" name="rv_textMarginTop" />         <!-- 刻度盘文字距离刻度边缘距离 -->
        <attr format="color|reference" name="rv_indcatorColor" />             <!-- 指示器颜色 -->
        <attr format="dimension|reference" name="rv_indcatorWidth" />         <!-- 指示器宽度，形状为三角时不起作用 -->
        <attr format="dimension|reference" name="rv_indcatorHeight" />        <!-- 指示器高度，形状为三角时不起作用 -->
        <attr format="enum|reference" name="rv_indcatorType">                 <!-- 指示器形状 -->
            <enum name="line" value="1" />                                    <!-- 线 -->
            <enum name="triangle" value="2" />                                <!-- 三角 -->
        </attr>
        <attr format="enum|reference" name="rv_strokeCap">                    <!-- 刻度线线帽 -->
            <enum name="round" value="1" />                                   <!-- 圆角 -->
            <enum name="butt" value="0" />                                    <!-- 无圆角 -->
            <enum name="square" value="2" />                                  <!-- 矩形 -->
        </attr>
        <attr format="color|reference" name="rv_resultTextColor" />           <!-- 结果文字颜色 -->
        <attr format="color|reference" name="rv_unitTextColor" />             <!-- 单位文字颜色 -->
        <attr format="dimension|reference" name="rv_resultTextSize" />        <!-- 结果文字大小 -->
        <attr format="dimension|reference" name="rv_unitTextSize" />          <!-- 单位文字大小 -->
        <attr format="string|reference" name="rv_unit" />                     <!-- 单位 -->
        <attr format="boolean|reference" name="rv_showResult" />              <!-- 是否显示结果 -->
        <attr format="boolean|reference" name="rv_showUnit" />                <!-- 是否显示单位 -->
        <attr format="boolean|reference" name="rv_alphaEnable" />             <!-- 是否刻度渐变 -->
    </declare-styleable>