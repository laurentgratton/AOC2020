(ns aoc
  (:require [days.day1 :as d1]
            [days.day2 :as d2]
            [days.day3 :as d3]
            [days.day4 :as d4]
            [days.day5 :as d5]))

(defn runDays []
  (print "Day 1 Part 1:" (d1/day1Part1 2020 d1/day1Input) "\n")
  (print "Day 1 Part 2:" (d1/day1Part2 2020 d1/day1Input) "\n")
  (print "------\n")
  (print "Day 2 Part 1:" (d2/day2Part1) "\n")
  (print "Day 2 Part 2:" (d2/day2Part2) "\n")
  (print "------\n")
  (print "Day 3 Part 1:" (d3/day3Part1) "\n")
  (print "Day 3 Part 2:" (d3/day3Part2) "\n")
  (print "------\n")
  (print "Day 4 Part 1:" (d4/day4Part1) "\n")
  (print "Day 4 Part 2:" (d4/day4Part2) "\n")
  (print "------\n")
  (print "Day 5 Part 1:" (d5/day5Part1) "\n")
  )

(defn -main [] (runDays))