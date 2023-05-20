package com.example.livinglab

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import net.daum.mf.map.api.*
import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapPointBounds;
import net.daum.mf.map.api.MapPolyline;
import net.daum.mf.map.api.MapView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapView = MapView(this)
        val mapViewContainer = findViewById<View>(R.id.map_view) as ViewGroup
        mapViewContainer.addView(mapView)

        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(37.53737528, 127.00557633), true)

        // 줌 레벨 변경

        // 줌 레벨 변경
        mapView.setZoomLevel(11, true)

        // 중심점 변경 + 줌 레벨 변경

        // 중심점 변경 + 줌 레벨 변경
        mapView.setMapCenterPointAndZoomLevel(
            MapPoint.mapPointWithGeoCoord(
                37.53737528,
                127.00557633
            ), 9, true
        )

        // 줌 인

        // 줌 인
        mapView.zoomIn(true)

        // 줌 아웃

        // 줌 아웃
        mapView.zoomOut(true)

        //마커 달기

        //마커 달기
        val marker = MapPOIItem()
        val MARKER_POINT = MapPoint.mapPointWithGeoCoord(37.53737528, 127.00557633)
        marker.itemName = "Default Marker"
        marker.tag = 0
        marker.mapPoint = MARKER_POINT
        marker.markerType = MapPOIItem.MarkerType.BluePin // 기본으로 제공하는 BluePin 마커 모양.

        marker.selectedMarkerType =
            MapPOIItem.MarkerType.RedPin // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.


        mapView.addPOIItem(marker)
        //마커2 달기
        //마커2 달기
        val marker2 = MapPOIItem()
        val MARKER_POINT2 = MapPoint.mapPointWithGeoCoord(37.545024, 127.03923)
        marker2.itemName = "Default Marker"
        marker2.tag = 0
        marker2.mapPoint = MARKER_POINT2
        marker2.markerType = MapPOIItem.MarkerType.BluePin // 기본으로 제공하는 BluePin 마커 모양.

        marker2.selectedMarkerType =
            MapPOIItem.MarkerType.RedPin // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.


        mapView.addPOIItem(marker2)

        //검색 지점과 현재 내 위치간의 폴리라인 긋기

        //검색 지점과 현재 내 위치간의 폴리라인 긋기
        val polyline = MapPolyline()
        polyline.tag = 1000
        polyline.lineColor = Color.argb(128, 255, 51, 0) // Polyline 컬러 지정.


        // Polyline 좌표 지정.

        // Polyline 좌표 지정.
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.537229, 127.005515)) //현재 내위치 받기

        polyline.addPoint(
            MapPoint.mapPointWithGeoCoord(
                37.545024,
                127.03923
            )
        ) //도착지 위치 받기(서버를 통해서 좌표를 받아야함)


        // Polyline 지도에 올리기.

        // Polyline 지도에 올리기.
        //mapView.addPolyline(polyline)

        // 지도뷰의 중심좌표와 줌레벨을 Polyline이 모두 나오도록 조정.

        // 지도뷰의 중심좌표와 줌레벨을 Polyline이 모두 나오도록 조정.
        val mapPointBounds = MapPointBounds(polyline.mapPoints)
        val padding = 100 // px

        mapView.moveCamera(CameraUpdateFactory.newMapPointBounds(mapPointBounds, padding))

    }


}
