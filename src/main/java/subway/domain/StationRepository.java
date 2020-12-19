package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
	private static final List<Station> stations = new ArrayList<>();

	public static List<Station> stations() {
		return Collections.unmodifiableList(stations);
	}

	public static void addStation(Station station) {
		stations.add(station);
	}

	public static boolean deleteStation(String name) {
		return stations.removeIf(station -> Objects.equals(station.getName(), name));
	}

	public static void deleteAll() {
		stations.clear();
	}

	public static void viewStations() {
		System.out.println("\n");
		for (int station = 0; station < stations.size(); station++) {
			System.out.println("[INFO] " + stations.get(station).getName());
		}
		System.out.println("\n");
	}
	
	public static boolean findStation(String name) {
		for (int stationCount = 0; stationCount < stations.size(); stationCount++) {
			if (stations.get(stationCount).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
