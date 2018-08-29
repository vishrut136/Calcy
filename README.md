<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RelativeLayout
        android:id="@+id/relativeLayout"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0">

        <EditText
            android:id="@+id/editTextCalcy"
            android:layout_width="363dp"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_marginStart="15dp"
            android:layout_marginTop="30dp"
            android:ems="10"
            android:inputType="number"
            android:text="0" />

        <Button
            android:id="@+id/allClear"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_marginStart="37dp"
            android:layout_marginTop="102dp"
            android:onClick="onClick"
            android:text="AC" />

        <Button
            android:id="@+id/squareRoot"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignTop="@+id/allClear"
            android:layout_marginEnd="37dp"
            android:text=" √" />

        <Button
            android:id="@+id/four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_alignStart="@+id/allClear"
            android:layout_marginBottom="203dp"
            android:onClick="onClick"
            android:text="4" />

        <Button
            android:id="@+id/five"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/eight"
            android:layout_alignTop="@+id/four"
            android:onClick="onClick"
            android:text="5" />

        <Button
            android:id="@+id/six"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/squareRoot"
            android:layout_alignTop="@+id/four"
            android:onClick="onClick"
            android:text="6" />

        <Button
            android:id="@+id/one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_alignStart="@+id/four"
            android:layout_marginBottom="143dp"
            android:onClick="onClick"
            android:text="1" />

        <Button
            android:id="@+id/two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/five"
            android:layout_alignTop="@+id/one"
            android:onClick="onClick"
            android:text="2" />

        <Button
            android:id="@+id/three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/six"
            android:layout_alignTop="@+id/one"
            android:onClick="onClick"
            android:text="3" />

        <Button
            android:id="@+id/clear"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_alignStart="@+id/four"
            android:layout_marginBottom="84dp"
            android:onClick="onClick"
            android:text="C" />

        <Button
            android:id="@+id/zero"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/five"
            android:layout_alignTop="@+id/clear"
            android:onClick="zero"
            android:text="0" />

        <Button
            android:id="@+id/equalTo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/six"
            android:layout_alignTop="@+id/clear"
            android:onClick="onClick"
            android:text="=" />

        <Button
            android:id="@+id/divide"
            android:layout_width="59dp"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_alignStart="@+id/allClear"
            android:layout_marginBottom="28dp"
            android:onClick="onClick"
            android:text="/" />

        <Button
            android:id="@+id/multiply"
            android:layout_width="59dp"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignTop="@+id/divide"
            android:layout_marginStart="115dp"
            android:onClick="onClick"
            android:text="*" />

        <Button
            android:id="@+id/subtract"
            android:layout_width="59dp"
            android:layout_height="wrap_content"
            android:layout_alignTop="@+id/divide"
            android:layout_toStartOf="@+id/squareRoot"
            android:onClick="onClick"
            android:text="-" />

        <Button
            android:id="@+id/add"
            android:layout_width="59dp"
            android:layout_height="wrap_content"
            android:layout_alignEnd="@+id/squareRoot"
            android:layout_alignTop="@+id/divide"
            android:onClick="onClick"
            android:text="+" />

        <Button
            android:id="@+id/seven"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_alignStart="@+id/allClear"
            android:layout_marginTop="196dp"
            android:onClick="onClick"
            android:text="7" />

        <Button
            android:id="@+id/eight"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignTop="@+id/seven"
            android:layout_centerHorizontal="true"
            android:onClick="onClick"
            android:text="8" />

        <Button
            android:id="@+id/nine"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/squareRoot"
            android:layout_alignTop="@+id/seven"
            android:onClick="onClick"
            android:text="9" />

    </RelativeLayout>
</android.support.constraint.ConstraintLayout>
