package com.guri.loginkt_new.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.guri.loginkt_new.R
import com.guri.loginkt_new.databinding.FragmentMapBinding
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint

import net.daum.mf.map.api.MapView


class mapFragment : Fragment(R.layout.fragment_map) {
    private var _binding: FragmentMapBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMapBinding.inflate(inflater, container, false)
        val view = binding.root

        val mapView = MapView(activity)
        val mapViewContainer = binding.mapView as ViewGroup
        mapViewContainer.addView(mapView)

        // 중심점 변경 - 경북대 북문교차로
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(35.89309206218225, 128.60870156290383), true);

        // 줌 레벨 변경
        mapView.setZoomLevel(4, true);

        //마커 찍기
        //마커 찍기
        val MARKER_POINT = MapPoint.mapPointWithGeoCoord(35.89309206218225, 128.60870156290383)
        val marker = MapPOIItem()
        marker.itemName = "Default Marker"
        marker.tag = 0
        marker.mapPoint = MARKER_POINT
        marker.markerType = MapPOIItem.MarkerType.BluePin // 기본으로 제공하는 BluePin 마커 모양.

        marker.selectedMarkerType =
            MapPOIItem.MarkerType.RedPin // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.


        mapView.addPOIItem(marker)


        return view
    }

}