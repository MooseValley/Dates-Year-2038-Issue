# Dates - Year 2038 problem (also called Y2038 or Y2k38 or Unix Y2K)

Explore the coming Year 2038 problem ...  by developing a Java GUI Desktop App.


### LGR Tech Tales - Y2K: The Year 2000 Problem
20:16: https://www.youtube.com/watch?v=Xm5OiB3CPxg?t=1216

### Unix time (also known as Epoch time, POSIX time,[1] seconds since the Epoch,[2] or UNIX Epoch time[3])
https://en.wikipedia.org/wiki/Unix_time

### Year 2038 problem
https://en.wikipedia.org/wiki/Year_2038_problem

### Time formatting and storage bugs
https://en.wikipedia.org/wiki/Time_formatting_and_storage_bugs

### Unix time:
* uses a signed 32 bit integer.
* number of seconds passed since 00:00:00 UTC on 1 January 1970

````
01111111111111111111111111111111 // 19 January 2038 at 03:14:08 UTC.
10000000000000000000000000000000 //            1901
````

### Java Dates:
* Java's use of 64-bit long integers everywhere to represent time as
"milliseconds since 1 January 1970" will work correctly for the
next 292 million years.
* uses signed 64 bit integer (long)
* number of milli-seconds passed since 00:00:00 UTC on 1 January 1970
* no worries for 292 million years
* REF: https://en.wikipedia.org/wiki/Year_2038_problem


## Source Code is on my GitHub:
https://github.com/MooseValley/Dates-Year-2038-Issue

## Youtube Video of me developing this Java GUI Desktop App:
https://youtu.be/KsUXIyokp6Y

## Moose's Software Valley - Established July, 1996.
https://rebrand.ly/MoosesSoftware
