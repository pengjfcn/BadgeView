package com.peacelevel.badge;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView;
	private Button btn;
	private ImageView imageView;
	private LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = (TextView) findViewById(R.id.tv1);
		btn = (Button) findViewById(R.id.btn1);
		imageView = (ImageView) findViewById(R.id.imageView1);
		layout = (LinearLayout) findViewById(R.id.layout1);

		BadgeView badgeView = new BadgeView(this);
		badgeView.setTargetView(textView);
		badgeView.setBadgeCount(3);

		badgeView = new BadgeView(this);
		badgeView.setTargetView(btn);
		badgeView.setBadgeCount(-7);

		badgeView = new BadgeView(this);
		badgeView.setTargetView(imageView);

		badgeView.setBadgeCount(0);

		badgeView = new BadgeView(this);
		badgeView.setTargetView(layout);
		badgeView.setBackground(12, Color.parseColor("#9b2eef"));
		badgeView.setText("朋友圈");

		badgeView = new BadgeView(this);
		badgeView.setTargetView(layout);
		badgeView.setBadgeGravity(Gravity.BOTTOM | Gravity.CENTER);
		badgeView.setBadgeCount(4);

		badgeView = new BadgeView(this);
		badgeView.setTargetView(layout);
		badgeView.setBadgeGravity(Gravity.CENTER);
		badgeView.setBackgroundColor(Color.RED);
		badgeView.setBadgeMargin(-1);
		badgeView.setTextColor(Color.BLACK);
		badgeView.setBadgeCount(10);

		badgeView = new BadgeView(this);
		badgeView.setTargetView(layout);
		badgeView.setBadgeGravity(Gravity.LEFT | Gravity.CENTER);
		badgeView.setBackground(20, Color.RED);
		badgeView.setTextColor(Color.BLACK);
		badgeView.setBadgeCount(-6);

		badgeView = new BadgeView(this);
		badgeView.setTargetView(layout);
		badgeView.setBadgeGravity(Gravity.TOP | Gravity.LEFT);
		badgeView.setTypeface(Typeface.create(Typeface.SANS_SERIF,
				Typeface.ITALIC));
		badgeView.setShadowLayer(2, -1, -1, Color.GREEN);
		badgeView.setBadgeCount(2);
		//badgeView.setVisibility(View.GONE);
	}
}
